package Formes;
import java.*;

public class TriangleRectangle extends FormeGeometrique{
	double hauteur, largeur;
	
	public TriangleRectangle(double x, double y, double h, double l){
		posX = x; posY = y; hauteur = h; largeur = l;
	}

	double surface(){	return hauteur*largeur/2;	}
	double perimetre(){	return hauteur+largeur+(Math.hypot(hauteur, largeur));	}
}
