package br.uefs.ecomp.api.util;

public class Test {
    public static void main(String[] args) {
        SinglyLinkedList<Pessoa> list = new SinglyLinkedList<>();
        Pessoa aa = new Pessoa();


        list.addFirst(new Pessoa("Anésio Neto", 26));
        list.addFirst(aa);

        System.out.println(!list.isEmpty() && list.size() == 2);
        list.removeFirst();
        System.out.println(list.first().getName() == "Anésio Neto");
        System.out.println(list.first().getAge() == 26);

        list.addLast(new Pessoa("Dulça", 61));

        System.out.println(list.last().getName());
    }
}
