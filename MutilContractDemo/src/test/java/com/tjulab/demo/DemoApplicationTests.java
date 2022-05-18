package com.tjulab.demo;

import com.alibaba.fastjson.JSONObject;
import com.tjulab.demo.entity.Person;
import com.tjulab.demo.entity.Product;
import com.tjulab.demo.service.BlockChainService;
import com.tjulab.demo.util.MyHex;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private BlockChainService blockChainService;

    @Test
    public void initialize() throws Exception {
        blockChainService.InitializeMultiLContract();
    }

    @Test
    public void testGet() throws Exception {

        String ClassName = Person.class.getName().toString();
        //String ClassName = Product.class.getName().toString();

        System.out.println(ClassName);
        String info = blockChainService.getInfo(ClassName);
        //System.out.println(info);

        if(info != ""){
            System.out.println("解码后："+ MyHex.HexStringToString(info));
            Person person = JSONObject.parseObject(MyHex.HexStringToString(info),Person.class);
            //Product product = JSONObject.parseObject(MyHex.HexStringToString(info),Product.class);
            System.out.println("json转class: Name = "+person.getName()+" Age = "+person.getAge());
            //System.out.println("json转class: Name = "+product.getName()+" desc = "+product.getDesc()+" price = "+product.getPrice());
        }else{
            System.out.println("未get到链上状态，创建新的状态：" + ClassName);
        }
        //KeyPairInfo wallet = blockChainService.createWallet();
    }

    @Test
    public void testSet() throws Exception {
        Person person = new Person();
        person.setAge(343);
        person.setName("zyh");

        /*Product product = new Product();
        product.setName("multiL");
        product.setDesc("test");
        product.setPrice(2342);*/

        /*String jsonStr = JSONObject.toJSONString(product);
        String classStr = Product.class.getName().toString();*/

        String jsonStr = JSONObject.toJSONString(person);
        String classStr = Person.class.getName().toString();

        blockChainService.setInfo(classStr , jsonStr);
        System.out.println("已将状态set回链上");
    }


    //为userList状态添加一些数据，并存储到链上
    //1.通过setContract将二进制.class文件存储上链，返回transactionID作为合约地址，
    //2.调用：通过 C#SDK的 getContractReturnValue(TxId) return exeContractResultValue
    //
    // aelf这边需要实现一个合约：getContractReturnValue(TxId) return exeContractResultValue
    /*
         1、getTransactionResult(TXID) return code.jar
         2、将code.jar注入到服务器文件系统
         3、利用脚本去在java环境中执行code.jar（脚本执行）
         4、将脚本执行后的结果返回给aelf <- c#有专门捕获命令行返回值的方法
         5、aelf再将结果返回c#，删除code.jar
    * */

    /*
    * 1、如何打成jar包，如何执行jar包（传参，返回值）
    * 2、jar包序列化：二进制
    * 3、写setContract合约，支持jar包存储
    * 4、写一个调用自定义合约的合约，步骤如上
    * 5、调研脚本书写语法、自动化执行合约逻辑，-> 返回一个值
    * 6、java环境安装，如何交互
    * */
    
    @Test
    public void addUserList() throws Exception {
        Person person1 = new Person();
        person1.setAge(22);
        person1.setName("zyh");

        Person person2 = new Person();
        person2.setAge(23);
        person2.setName("fy");

        Person person3 = new Person();
        person3.setAge(25);
        person3.setName("pdx");

        ArrayList<Person> personList = new ArrayList<>();

        //调用get合约
        String respList = blockChainService.getInfo("personList");
        if(respList != null){
            System.out.println("解码后："+ MyHex.HexStringToString(respList));
        }else{
            System.out.println("未获取到状态，将创建personList状态");
        }

        //自定义合约逻辑：向该状态添加一些数据
        personList.add(person1);
        personList.add(person2);
        //personList.add(person3);

        String jsonStr = JSONObject.toJSONString(personList);
        blockChainService.setInfo("personList" , jsonStr);

        System.out.println("已经将状态set回链上，其状态为：");
        String resp = blockChainService.getInfo("personList");
        System.out.println(MyHex.HexStringToString(resp));
    }

    @Test
    public void testTokenTransfer() throws Exception {
        String privateKey1 = "b465f9d58248a49fd708fd1147b96e7e7be6f017e2c3beb6f529b1a6b0788b70";
        String privateKey2 = "4551eb2ca5545732e913a2f9c447245a56b43bf66b9ad917520dbde1e0ca81b5";

        System.out.println("账户A balance：" + blockChainService.getBalance(privateKey1));
        System.out.println("账户B balance：" + blockChainService.getBalance(privateKey2));
    }

    @Test
    public void testTransfer() throws Exception{
        String privateKey1 = "b465f9d58248a49fd708fd1147b96e7e7be6f017e2c3beb6f529b1a6b0788b70";
        String privateKey2 = "4551eb2ca5545732e913a2f9c447245a56b43bf66b9ad917520dbde1e0ca81b5";

        System.out.println("账户A balance：" + blockChainService.getBalance(privateKey1));
        System.out.println("账户B balance：" + blockChainService.getBalance(privateKey2));

        String toPrivateKey = "4551eb2ca5545732e913a2f9c447245a56b43bf66b9ad917520dbde1e0ca81b5";
        long amount = 100000;
        blockChainService.setBalance(toPrivateKey , amount);
        System.out.println("账户A向账户B转账了: " + amount);

        System.out.println("转账之后----");
        System.out.println("账户A balance：" + blockChainService.getBalance(privateKey1));
        System.out.println("账户B balance：" + blockChainService.getBalance(privateKey2));
    }

}
