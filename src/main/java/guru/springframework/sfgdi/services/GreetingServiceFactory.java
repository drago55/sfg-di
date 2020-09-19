package guru.springframework.sfgdi.services;

public class GreetingServiceFactory {

    private final GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService creatGreatingService(String lang){
        switch (lang) {
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "de":
                return new PrimaryGermanService(greetingRepository);
            case "es":
                return new PrimarySpanishService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }

}
