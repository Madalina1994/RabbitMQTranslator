package starter;

import translator.RabbitMQTranslator;

public class Starter {

    public static void main( String[] args ) throws Exception {
        RabbitMQTranslator rabbitMQTranslator = new RabbitMQTranslator();
        rabbitMQTranslator.init();
    }
}
