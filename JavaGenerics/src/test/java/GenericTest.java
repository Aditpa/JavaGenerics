import org.junit.jupiter.api.Test;

import javax.lang.model.type.NullType;

import static org.junit.jupiter.api.Assertions.*;

class GenericTest {


    @Test
    void checkingIfGenericsWork(){
        Apple apple=new Apple("Red",true);
        Generic<Apple> generic=new Generic<>();
        generic.add(apple);
        assertEquals(generic.getWithIndex(0),apple);

    }

    @Test
    void checkingIfItsNull(){
        Generic<Apple> generic=new Generic<>();
        generic.add(null);
        assertNull(generic.getWithIndex(0));
    }
    @Test
    void removeItem(){

    }

}