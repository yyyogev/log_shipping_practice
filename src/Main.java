import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.lang.Thread.sleep;

//import org.apache.logging.log4j.ThreadContext;
public class Main {


    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(Main.class);
        System.out.println("Hello World!");
        logger.info("Testing logz.io!");
        logger.warn("Winter is coming");
        for (int i = 100000; i < 150000; i++) {
            if (isPrime(i)) {
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                logger.info("found prime number " + i);
            }
        }
    }

    private static boolean isPrime(int num)
    {
        if (num == 2)
            return true;
        if (num < 2 || num % 2 == 0)
            return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0)
                return false;
        return true;
    }
}
