package Structural.Facade.Classes;

public class Facade {
    public static String verificaDisponibilitateBucatari(int nrBucatariMinimNecesari, String data){
        GestiuneBucatari bucatari=new GestiuneBucatari();
        bucatari.addBucatar(new Bucatar("Bucatar 1"));
        bucatari.addBucatar(new Bucatar("Bucatar 2"));
        bucatari.addBucatar(new Bucatar("Bucatar 3"));

        int nrBucatriDisponibili=0;
        for(int i=0;i<bucatari.getNrBucatari();i++){
            if(bucatari.getBucatar(i).verificaDisponibilitate(data)){
                nrBucatriDisponibili++;
            }
        }
        if(nrBucatriDisponibili>=nrBucatariMinimNecesari){
            return "Sunt suficienti bucatari disponibili: "+nrBucatriDisponibili+" din "+nrBucatariMinimNecesari+" pentru data de "+ data;
        }else{
            return "Nu sunt suficienti bucatari disponibili: "+nrBucatriDisponibili+" din "+nrBucatariMinimNecesari+" pentru data de "+ data;

        }
    }

    public static String verificaDisponibilitateSala(String data){
        GestiuneSali sali=new GestiuneSali();

        sali.addSala(new Sala("Sala 1", 20, 40));
        sali.addSala(new Sala("Sala 2", 10, 60));
        sali.addSala(new Sala("Sala 3", 15, 70));

        //verificam daca avem vreo sala care poate gazdui > 50 participanti
        for(Sala sala:sali.getListaSali()){
            if(sala.getNrMaxParticipanti()>50) {
                return "Sala disponibila: " + sala.getDenumire() + " pentru data " + data;
            }
        }
        return "Nu sunt sali disponibile pentru data " + data;
    }
}
