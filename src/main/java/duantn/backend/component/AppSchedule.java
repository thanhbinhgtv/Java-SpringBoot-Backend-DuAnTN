package duantn.backend.component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class AppSchedule {
    @Scheduled(cron = "0 0 0 * * *")
    public void AutoCreatTimekeeping() {
        System.out.println(new Date().toString());
    }
}
