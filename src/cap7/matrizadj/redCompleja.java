/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap7.matrizadj;

/**
 *
 * @author Valdecs
 */
class redCompleja {
    int matDensidad[] = new int[33];	//Arreglo con 33 espacios que guarda el grado de cada vertice
	//int matVertices[] = new int[10];
	int iguales;						//Cantidad de vertices que tienen el mismo grado
	float resultadoDis = 0;					//Resultado de la distribucion de cada vertice
	double densidad = 0;				//Resultado de la densidad;
	
	

	 public int obtenAristas ( int cantidad, int k )
	 {
	 	matDensidad[k] = cantidad;			//guarda en una matriz nueva cada grado de cada vertice desde un parametro de la clase redMain
	 	
	 	
	 	//System.out.printf("%s %d ", "Arreglo: ",matDensidad[k]);
	 	return matDensidad[k];
	 }

	 public void ordenVertices ()
	 {					
	 	
/*for (int k=0 ; k<matDensidad.length;k++ ) {
	matVertices[k] = matDensidad[k];
}													
	 	for (int i = 0 ; i < 33 ; i++ ) {
	 		for (int j = 0; j < 33 ; j++) {
	 			
	 			if( matVertices[i] == matDensidad[j])
	 				cantidad++;
	 		}
	 		matVertices[i] = cantidad;
	 		cantidad=0;
	 	}
	 	for (int i = 0; i < 33; i++ ) {
	 		
	 	
	 	System.out.printf("\n%s %d %d","Repeticion: ", matDensidad[i], matVertices[i]);
	 }*/

	 System.out.printf("\n\nDistribucion de Grado\n");
       
       System.out.printf("%s\t%s\t%s\n","K ","Numero de vertices","Pr(K)");
      
         iguales=0;
         
         for(int i=0;i<matDensidad.length;i++)			//pasa 1 ves cada grado en toda la matriz
         {
         	for( int j=0; j<matDensidad.length; j++)
         	{
         		if(matDensidad[j]==i)					//compara cada grado en cada vuelta
         			{ 
         				iguales=iguales+1;  			//se suman las veces que se repite en la matriz
         				
         			} 
         	}
        
        	 if(iguales!=0)
         		{
         		resultadoDis = (float) iguales / 33;	//se calcula la distribucion de cada grado y se imprime
       			System.out.printf("%d\t%d\t\t\t%f\n", i, iguales, resultadoDis);
       			}  
       	iguales=0;
         }
	 }


	 /*public void imprimirRepeticion ()
	 {
	 	if ( matVertices[i] > 1)
	 		for ( int j = 0 ; j < matDensidad.length ; j++)
	 			
	 				if (matDensidad[i] != matDensidad[j])
	 		
	 	}*/

	 	public void densidadGrafo( double totalAri)		
	 	{												//objeto que recibe un argumento int y lo combierte en double
	 		totalAri = totalAri/2;
	 		densidad = (((2*totalAri))/(33.0*(33.0-1)));	//calcula la densidad e imprime el resultado
	 		System.out.printf("\n\n%s\t%2.4f","Densidad del Grafo: ",densidad);
	 	}
}
