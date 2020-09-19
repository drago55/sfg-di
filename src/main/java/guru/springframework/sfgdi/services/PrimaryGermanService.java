package guru.springframework.sfgdi.services;

public class PrimaryGermanService implements GreetingService {

    private final GreetingRepository greetingRepository;

    public PrimaryGermanService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return null;
    }
}
