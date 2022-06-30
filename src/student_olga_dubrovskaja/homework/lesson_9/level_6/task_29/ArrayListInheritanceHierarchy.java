package student_olga_dubrovskaja.homework.lesson_9.level_6.task_29;

class ArrayListInheritanceHierarchy {
}
 class Object{

 }
abstract class AbstractCollection<E> extends Object{

}

abstract class AbstractList<E> extends AbstractCollection<E> {

}

class ArrayList<E> extends AbstractList<E> {

}