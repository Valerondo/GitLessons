package Start;

import Packet1.Person;

class TestDostup {
    public int id;

    public static void main(String[] args) {
        /*public - доступ везде в проекте
          private - доступ только в пределах класса
          default - если не указывать модификатор доступа (по-умолчанию) - доступ в пределах пакета
          protected - доступны в пределах пакета, также доступны всем подклассам, даже если подклассы вне пакета декларируемых методов/объектов
         */

        /*
        В java файле не может быть два одновременно публичных классов, но должен быть хоть 1
         */

        Person p1 = new Person();
        p1.name = "Bob";
    }
}
