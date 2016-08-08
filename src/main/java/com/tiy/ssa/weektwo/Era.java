package com.tiy.ssa.weektwo;


public  class Era{
	
	
	final int birth, death;
	public Era(int birth, int death){
		this.birth = birth;
		this.death = death;
	}
	@Override
	public String toString(){
		return String.format("b. &d - d. %d", this.birth, this.death);		
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + birth;
		result = prime * result + death;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Era other = (Era) obj;
		if (birth != other.birth)
			return false;
		if (death != other.death)
			return false;
		return true;
	}
}