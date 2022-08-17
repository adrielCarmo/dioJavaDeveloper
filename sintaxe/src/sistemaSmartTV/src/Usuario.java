public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        
        System.out.print("Status: ");
        System.out.println(smartTv.ligada ? "Ligada" : "Desligada");
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
    }
}
