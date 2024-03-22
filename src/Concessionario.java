import java.util.Arrays;

public class Concessionario {
    private Auto[] auto;
    public Concessionario(Auto[] auto) {
        this.auto = auto;
    }
    public void prezzoMinMax(Auto[] auto) {
        double prezzoMin = auto[0].getPrezzoVendita();
        double prezzoMax = auto[0].getPrezzoVendita();
        for (int i = 0; i < auto.length; i++) {
            if (auto[i].getPrezzoVendita() <= prezzoMin) {
                prezzoMin = auto[i].getPrezzoVendita();
            }
            if (auto[i].getPrezzoVendita() > prezzoMax) {
                prezzoMax = auto[i].getPrezzoVendita();
            }
        }
        System.out.println("Prezzo minimo: " + prezzoMin + "Prezzo massimo: " + prezzoMax);
    }
    public void stampaAuto() {
        System.out.println("Auto nel concessionario:");
        for (Auto auto : auto) {
            System.out.println(auto);
        }
    }
 //   public void stampaAuto() {
 //       for(int i = 0; i < auto.length; i++) {
 //           System.out.println(auto[i]);
 //       }
 //   }
    public Auto[] getAuto() {
        return auto;
    }

    public void setAuto(Auto[] auto) {
        this.auto = auto;
    }

    @Override
    public String toString() {
        return "Concessionario{" +
                "auto=" + Arrays.toString(auto) +
                '}';
    }
}
