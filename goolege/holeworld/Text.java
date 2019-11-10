package com.google.reading;

public class Text {
    public static void main(String[] args) {
        //测试并输出小说页数199，价格12
        Fiction f = new Fiction(199,12,null);
        f.Info();
        //测试并输出杂志页数13，价格30，出版周期6个月
        Magazine m = new Magazine(13,30,"6 months");
        m.Info();
        //测试并输出期刊页数274，价格36，出版周期3年
        Journal j = new Journal(274,36,"3 years");
        j.Info();
        //测试并输出课本页数187，价格45，适用对象学生
        Textbook t = new Textbook(187,45,"students");
        t.Info();
    }
}
