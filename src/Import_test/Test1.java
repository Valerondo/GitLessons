package Import_test;

import Forest.Something.SomeClass;
/*import Forest.Squirell;
import Forest.Tree;*/

import Forest.*; //импорт всех классов из пакета

public class Test1 {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Squirell squirell1 = new Squirell();

        SomeClass something = new SomeClass();
    }
}
