public List<Cell> getFlaggedCells(){
	List<Cell> flaggedCells = new ArrayList<Cell>();
	for(Cell cell : gameBoard){
		if(cell.isFlagged()){
			flaggedCells.add(cell);
		}
	}
	return flaggedCells;
}
