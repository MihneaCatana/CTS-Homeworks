package ro.ase.cts.s02;

import java.io.*;

public class MatrixDataHandler {
    private int[][] matrix;
    private int h;
    private int w;
    private String filename;

    //    matricea trebuie tot timpul salvata local
    //    trebuie sa verificam fisierul daca a fost alterat. Daca matricea locala este diferita fata de cea din fisier, reincepem actualizarea
    //    putem separa citirea din fisier , scrierea in matrice,
    //    trebuie sa verificam daca posH si posW sunt in afara dimensiunilor
    //

//    TODO
//    Tratare caz in care a fost modificat fisierul
//    Separare in diferite metode -citire matrice din fisier, scriere matrice in fisier, alocare spatiu matrice
//    Tratare exceptii


    /**
     * Constructorul
     * @param h  numarul de linii
     * @param w  numarul de coloane
     * @param filename  numele fisierul in care o sa scriem
     */
    public MatrixDataHandler(int h, int w, String filename) {
        constructor(h,w,filename);
    }

    /**
     * Aceasta functie are rolul de constructor si este folosita atunci cand este nevoie sa fie reinitializata matricea
     */
    private void constructor(int height, int width,String filename)
    {
        this.filename = filename;
        this.h = height;
        this.w = width;
        matrix = new int[height][];
        for (int i = 0; i < height; i++) {
            matrix[i] = new int[width];
        }

        try {
            writeMatrixFile(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getValueFromPosition(String filename, int posH, int posW) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            int height = Integer.parseInt(line.split(" ")[0]);
            int width = Integer.parseInt(line.split(" ")[1]);

            if(posH >= height || posW >= width)
            {
                System.out.println("Invalid position!");
                return -1;
            }

            validationMatrix(br,height,width);

            return matrix[posH][posW];

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            return -1;
        }
    }

    private void validationMatrix(BufferedReader br,int height, int width) throws IOException {
        if(height != this.h || width != this.w)
        {
            constructor(height,width,filename);
            for (int i = 0; i < h; i++) {
                String line = br.readLine();
                for (int j = 0; j < w; j++) {
                    matrix[i][j] = Integer.parseInt(line.split(" ")[j]);
                }
                br.close();
            }
        }
        else {
//            matrice de comparatie
            int [][] verificationMatrix = new  int[height][];
            for(int i =0;i<height;i++)
                verificationMatrix[i] = new int[width];

//            verificam daca cele 2 matrici sunt egale
            boolean differentMatrix = false;
            for (int i = 0; i < h; i++) {
                String line = br.readLine();
                for (int j = 0; j < w; j++) {
                    verificationMatrix[i][j] = Integer.parseInt(line.split(" ")[j]);
                    if (verificationMatrix[i][j] != matrix[i][j])
                    {
                        constructor(height, width, filename);
                        differentMatrix = true;
                    }
                    break;
                }
                if(differentMatrix == true)
                {
                    br.close();
                    break;
                }
            }
        }
    }

    public void modifyValueAndUpdateFile(String filename, int posH, int posW, int val) {
        try {

            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            int height = Integer.parseInt(line.split(" ")[0]);
            int width = Integer.parseInt(line.split(" ")[1]);


            if(posH >= height || posW >= width)
            {
                System.out.println("Invalid position!");
                return ;
            }

            validationMatrix(br,h,w);

            matrix[posH][posW] = val;
            writeMatrixFile(filename);

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private void writeMatrixFile(String filename) throws IOException {

        FileWriter fw = new FileWriter(filename);
        fw.write(h + " " + w + "\n");
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                fw.write(matrix[i][j] + " ");
            }
            fw.write("\n");
        }
        fw.close();
    }

}
