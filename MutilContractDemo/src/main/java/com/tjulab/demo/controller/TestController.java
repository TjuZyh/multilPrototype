package com.tjulab.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.tjulab.demo.entity.Person;
import com.tjulab.demo.entity.VoteBlockChain;
import com.tjulab.demo.service.BlockChainService;
import com.tjulab.demo.util.MyHex;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zyh
 * @Date 2022/5/10 8:27 下午
 * @Version 1.0
 */

@RestController
public class TestController {

    @Autowired
    private BlockChainService blockChainService;

    @GetMapping("/get")
    public String multiLGet(String className) throws Exception{
        blockChainService.InitializeMultiLContract();
        String info = blockChainService.getInfo(Person.class.toString());
        System.out.println("解码后："+ MyHex.HexStringToString(info));
        if(info != ""){
            Person person = JSONObject.parseObject(MyHex.HexStringToString(info),Person.class);
            //Product product = JSONObject.parseObject(myHex.HexStringToString(info),Product.class);
            System.out.println("json转class: Name = "+person.getName()+"Age = "+person.getAge());
            //System.out.println("json转class: Name = "+product.getName()+"desc = "+product.getDesc()+"price = "+product.getPrice());
        }
        //KeyPairInfo wallet = blockChainService.createWallet();
        return info;
    }

    @ApiOperation(value = "多语言")
    @PostMapping("/set")
    public VoteBlockChain multiLSet(String className, String jsonString) throws Exception {
        Person person = new Person();
        person.setAge(343);
        person.setName("zyh");

        return blockChainService.setInfo(Person.class.toString(), JSONObject.toJSONString(person));
    }


}
