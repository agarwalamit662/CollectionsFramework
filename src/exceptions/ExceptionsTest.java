package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by amitagarwal3 on 8/31/2017.
 */
public class ExceptionsTest {


}

class A{

    void test() throws IOException{

    }

    void test1(){

    }

    void test2() throws Exception{

    }

    void test3() throws NumberFormatException{

    }

}

class B extends A{

    void test() throws FileNotFoundException{

    }

    void test1() throws ArrayIndexOutOfBoundsException{

    }

    void test2() throws NumberFormatException{

    }

    void test3() throws ArrayIndexOutOfBoundsException{

    }

}
