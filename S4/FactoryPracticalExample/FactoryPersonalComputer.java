package FactoryPracticalExample;


enum TypeOfDevice{
    Calculator,Notebook
}

public class FactoryPersonalComputer  {

        public static Computer createInstance(TypeOfDevice device,String nameOfDevice){

            switch (device){

                case Calculator : return new Calculator(nameOfDevice);
                case Notebook: return new Notebook(nameOfDevice);
                default: return  null;
            }
        }
}
