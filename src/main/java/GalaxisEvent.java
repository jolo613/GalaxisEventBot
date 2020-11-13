import org.javacord.api.AccountType;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

import java.util.Timer;

public class GalaxisEvent {
    private static DiscordApi api;

    public static DiscordApi getApi() {
        return api;
    }

    public static void main(String[] args) {
        api = new DiscordApiBuilder().setAccountType(AccountType.CLIENT)
                .setToken(args[0]).login().join();

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new EventTask(), 1000, 1500);
    }


    // https://discord.gg/zM4xaWWs5E


}
