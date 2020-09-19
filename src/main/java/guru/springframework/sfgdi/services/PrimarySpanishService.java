package guru.springframework.sfgdi.services;

public class PrimarySpanishService implements GreetingService {

    private final GreetingRepository greetingRepository;

    public PrimarySpanishService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
