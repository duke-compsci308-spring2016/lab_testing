package voogasalad;

import java.util.ArrayList;
import java.util.Collection;

import javafx.util.Pair;

public class Map {
	String[][] myMap;
	public Map(int size){
		myMap = new String[size][size];
	}
	public void store(int x, int y, String landValue){
		if(checkBounds(x,y)){
			myMap[x][y] = landValue;
		}
	}
	public String get(int x, int y){
		if(checkBounds(x,y)){
			return myMap[x][y];
		}
		return "";
	}
	private boolean checkBounds(int x, int y){
		return (x < myMap.length) && (y < myMap.length);
	}
	public Collection<Pair<Integer, Integer>> findLandValue(String landVal){
		ArrayList<Pair<Integer, Integer>> locs = new ArrayList<>();
		for(int i = 0;i < myMap.length;i++){
			for(int j = 0;j < myMap[i].length;j++){
				if(myMap[i][j] == landVal){
					locs.add(new Pair<Integer, Integer>(i, j));
				}
			}
		}
		return locs;
	}
	public int size(){
		return myMap.length;
	}

}
