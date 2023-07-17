
public class Percolation {
	private int size, openSites_Count=0, val=1, first, last;
	private int[][] grid;
	int arr_size;

	public Percolation(int n) {
		arr_size = n+1;
		size = n;
		last = size;
		first = 1;

//		grid = new int[size][size];
		grid = new int[arr_size][arr_size];

		for(int i=1; i<=size; i++)
			for(int j=1; j<=size; j++)
				grid[i][j] = -((i*val)+j);

		while(n>0) {
			val*=10;
			n/=10;
		}
	}

	public void validateParams(int a) {
		if(a<=0 || a>size)
			throw new IllegalArgumentException();
	}

	public void open(int row, int col) {
		validateParams(row);
		validateParams(col);
		int top, bottom, left, right;
		top = bottom= left = right = -1;
		grid[row][col]*=-1;

		// If it is the 1st row site, then assigning its index to itself. 
		// This will be used by other sites to copy its value to identify as an open site.
		//		if(row != first) {
		if(!noTop(row, col))
			top = grid[row-1][col];
		if(!noBottom(row, col))
			bottom = grid[row+1][col];
		if(!noLeft(row, col))
			left = grid[row][col-1];
		if(!noRight(row, col))
			right = grid[row][col+1];

		
		if(isOpen(get_row_Index(top/val), top%val)) {
			for(int j=1; j<=size; j++)
				if(grid[first][j] == top)
					grid[row][col] = top;
		}else if(isOpen(get_row_Index(bottom/val), bottom%val)) {
			for(int j=1; j<=size; j++)
				if(grid[first][j] == bottom)
					grid[row][col] = bottom;
		}else if(isOpen(get_row_Index(left/val), left%val)) {
			for(int j=1; j<=size; j++)
				if(grid[first][j] == left)
					grid[row][col] = left;
		}else if(isOpen(get_row_Index(right/val), right%val)) {
			for(int j=1; j<=size; j++)
				if(grid[first][j] == right)
					grid[row][col] = right;
		}
		
	}

	public int get_row_Index(int n) {
		return ((n/val)>0) ? (n/val) : first;
	}

	public boolean noTop(int r, int c) {
		return ((r==first) && ((c>0) && (c<=size))) ? true : false;
	}

	public boolean noBottom(int r, int c) {
		return ((r==last) && ((c>0) && (c<=size))) ? true : false;
	}

	public boolean noLeft(int r, int c) {
		return ((c==first) && ((r>0) && (r<=size))) ? true : false;
	}

	public boolean noRight(int r, int c) {
		return ((c==last) && ((r>0) && (r<=size))) ? true : false;
	}

	public boolean isOpen(int row, int col) {
		validateParams(row);
		validateParams(col);
		return (grid[row][col]>0) ? true : false;
	}

	public boolean isFull(int row, int col) {
		validateParams(row);
		validateParams(col);
		
		if(!isOpen(row, col))
			return false;

		for(int i=1; i<=size; i++)
			if(grid[row][col] == grid[first][i])
				return true;
		return false;
	}

	public int numberOfOpenSites() {
		return openSites_Count;
	}

	public boolean percolates() {
		for(int i=1; i<=size; i++)
			for(int j=1; j<=size; j++)
				if(grid[last][i] == grid[first][j])
					return true;
		return false;		
	}

//	public static void main(String[] coursera) {
//
//	}
}
