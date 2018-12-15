public class KiwiJuiceEasy {
	public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
		for (int i = 0; i < fromId.length; i++) {
			int fromSize = bottles[fromId[i]];
			int toCapacity = capacities[toId[i]];
			int toBottle = bottles[toId[i]];
             
             int addSize = fromSize + toBottle;
             int changedSize = Math.min(addSize, toCapacity);
             
			bottles[toId[i]] = changedSize;
			bottles[fromId[i]] = addSize - bottles[toId[i]];
             
         }
         
         return bottles;
     }
}
