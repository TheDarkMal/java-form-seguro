package seguro_de_vida;

public class Seguro_de_vida {

public Seguro_de_vida(){

}

public long calcular(long valorbase, boolean fumador,boolean alcoholico,boolean drogadicto,boolean cardiaco){
long total=0;
    
double recFumador=0, recAlcoholico=0,recDrodicto=0,recCardiaco=0;

if (fumador){
    recFumador=valorbase*0.10;
}
if (alcoholico){
    recAlcoholico=valorbase*0.20;
}
if (drogadicto){
    recDrodicto=valorbase*0.25;
}
if (cardiaco){
    recCardiaco=valorbase*0.30;
}
total=(long) (valorbase-(recFumador+recAlcoholico+recDrodicto+recCardiaco));
return total;
}
}
