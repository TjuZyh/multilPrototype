package com.tjulab.demo;

/**
 * @Author zyh
 * @Date 2022/5/17 9:12 下午
 * @Version 1.0
 */
public class voteContract {
    public static void addVote(){
        System.out.println("...");
    }

    public static void deleteVote(){
        System.out.println("...");
    }

    public static void main(String[] args) throws Exception {
        if(args[0].equals("addVote")){
            addVote();
        }else if(args[0].equals("deleteVote")){
            deleteVote();
        }else{
            throw new Exception();
        }
    }
}
