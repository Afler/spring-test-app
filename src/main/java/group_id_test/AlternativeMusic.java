package group_id_test;

import org.springframework.stereotype.Component;

@Component
public class AlternativeMusic implements Music{
    @Override
    public String getSong() {
        return "Deathbeds";
    }
}
