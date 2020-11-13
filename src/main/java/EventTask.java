import org.javacord.api.entity.channel.TextChannel;

import java.util.HashSet;
import java.util.Set;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;

public class EventTask extends TimerTask {
    private final TextChannel channel;
    private final Set<Integer> numbers;

    public EventTask() {
        channel = GalaxisEvent.getApi().getTextChannelById("775178191102017536").get();
        numbers = new HashSet<>();
    }

    public void run() {
        if (channel != null) {
            if (channel.canYouWrite()) {
                int i = ThreadLocalRandom.current().nextInt(80000, 89999);
                while (numbers.contains(i) || (!(i + "").endsWith("2"))) {
                    i = ThreadLocalRandom.current().nextInt(80000, 89999);
                }
                numbers.add(i);
                channel.sendMessage("" + i);
                System.out.println(i);
            } else {
                System.out.println("Can't talk in channel!");
            }
        } else {
            System.out.println("Channel is null!");
        }

    }
}
