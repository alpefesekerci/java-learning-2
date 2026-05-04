package week10;

public class TypeCasting {
    static void main(String[] args) {
        char basHarfi = 'A';
        double saatlikUcret = 247.63;
        int isSaati = 40;
        boolean tamZamanliMi = true;

        double maas = saatlikUcret * isSaati;
        int yuvarlanmisMaas = (int) maas;

        System.out.println(basHarfi + " calisaninin brut maasi: " + maas);
        System.out.println(basHarfi + " calisaninin yuvarlanmis maasi: " + yuvarlanmisMaas);
        System.out.println(basHarfi + " calisani tam zamanli mi: " + (tamZamanliMi ? "evet" : "hayir"));
    }
}
