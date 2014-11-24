package Level3;

import java.util.ArrayList;
import java.util.Collections;


public class UniquesElements {
	
	public ArrayList<Integer> getUniques(ArrayList<Integer> seq)
	{
		ArrayList<Integer> uniquesCol = new ArrayList<Integer>();
		int aux = 0;
		
		for(int i = 0; i < seq.size(); i++)
		{
			aux = seq.get(i);
			
			if(i>0)
			{
				if (aux != seq.get(i-1))
				uniquesCol.add(aux);
			}

			if (i == 0)
				uniquesCol.add(aux);
		}
		
		Collections.sort(uniquesCol);
		
		return uniquesCol;
	}

}
