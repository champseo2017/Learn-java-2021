package com.company;

public class Main {

    public static void main(String[] args) {
        AnimalInterface cat = () -> "Meow";
        AnimalInterface cock = () -> "Cock-a-doo-dle-doo";
        System.out.println(cat.yell());
        System.out.println(cock.yell());
    }
}

/*
* FunctionalInterface
* AnimalInterface กำหนด abstract method เพียงตัวเดียว คือ yell
* class Main ใช้ Lambda Expression ในการอิมพลิเมนต์อินเทอร์เฟส
* ทั้งนี้หากอินเทอร์เฟสที่ระกาศ Annotation @FunctionalInterface มี abstract method มากกว่าหนึ่งเมธอด เมื่อคอมไฟล์โปรแกรมแล้วจะ Error
*
*
*
*
* */
