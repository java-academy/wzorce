class Wojownik {
    private String broń;

    Wojownik(String broń) {
        this.broń = broń;
    }

    public static void main(String[] args) {
        Wojownik wojownik = new Wojownik("Karabin");
        wojownik.wojuj();

        wojownik.zmieńBroń("Miecz");
        wojownik.wojuj();
    }

    void wojuj() {
        switch (broń) {
            case "Karabin":
                System.out.println("Załadowuję karabin! TRRRR");
                break;
            case "Miecz":
                System.out.println("Wyciągam miecz i atakuję!");
                break;
            case "Łuk":
                System.out.println("Naciągam łuk! Strzał do celu!!!");
                break;
            case "Pistolet":
                System.out.println("Naciskam na spust! Pif Paf!");
                break;
            default:
                System.out.println("Nie dostałem broni! Walka wręcz, AAAA...umieram...");
            }
    }

    void zmieńBroń(String broń) {
        this.broń = broń;
    }
} 
