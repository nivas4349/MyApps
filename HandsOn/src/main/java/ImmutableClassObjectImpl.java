/**
 * @author: Siva Srinivasa Pasam
 * Jun 9, 2020
 *
 */
public final class ImmutableClassObjectImpl {
	private int i;
	private final PostIncrementVsPreIncrement ps = new PostIncrementVsPreIncrement();
	public ImmutableClassObjectImpl(int p, PostIncrementVsPreIncrement pi) {
		this.i=p;
		PostIncrementVsPreIncrement ps1 = new PostIncrementVsPreIncrement();
		// ps1.deepCopy(pi);
	}
	
	public int getInteger(){
		return i;
	}
	
	public PostIncrementVsPreIncrement getPostIncrementVsPreIncrement(){
		//return copy
		PostIncrementVsPreIncrement ps1 = new PostIncrementVsPreIncrement();
//		ps1.deepCopy(ps);
		return ps1;
	}
}
