package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.SpectatorNormal;
import ro.ase.cts.template.clase.SpectatorVIP;

public class Main {
    public static void main(String[] args) {
        SpectatorNormal spectatorNormal = new SpectatorNormal("Gigel");
        SpectatorVIP spectatorVIP = new SpectatorVIP("Emilian", 1);

        spectatorNormal.intraPeStadion();
        System.out.println("--------------");
        spectatorVIP.intraPeStadion();
    }
}
