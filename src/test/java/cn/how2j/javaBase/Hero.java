package cn.how2j.javaBase;

/**
 * Author beck
 * Date 2020/2/17 22:38
 * 设计一个LOL的英雄类，创建两个英雄，一个叫盖伦，一个叫提莫
 **/
public class Hero {
    String name;  //姓名
    String hp;    //血量
    float armor;  //护甲
    int moveSpeed;  //移动速度

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = "616";
        garen.armor = 27f;
        garen.moveSpeed = 350;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = "383";
        teemo.armor = 14f;
        teemo.moveSpeed = 330;
    };
}
