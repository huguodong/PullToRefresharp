package md5ac83115f443195b56e4f2ac6a88d83f7;


public class SwipeMenuAdapter
	extends android.widget.BaseAdapter
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_areAllItemsEnabled:()Z:GetAreAllItemsEnabledHandler\n" +
			"n_isEnabled:(I)Z:GetIsEnabled_IHandler\n" +
			"n_getCount:()I:GetGetCountHandler\n" +
			"n_getItem:(I)Ljava/lang/Object;:GetGetItem_IHandler\n" +
			"n_getItemId:(I)J:GetGetItemId_IHandler\n" +
			"n_getItemViewType:(I)I:GetGetItemViewType_IHandler\n" +
			"n_getView:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;:GetGetView_ILandroid_view_View_Landroid_view_ViewGroup_Handler\n" +
			"n_hasStableIds:()Z:GetHasStableIdsHandler\n" +
			"n_isEmpty:()Z:GetIsEmptyHandler\n" +
			"n_registerDataSetObserver:(Landroid/database/DataSetObserver;)V:GetRegisterDataSetObserver_Landroid_database_DataSetObserver_Handler\n" +
			"n_unregisterDataSetObserver:(Landroid/database/DataSetObserver;)V:GetUnregisterDataSetObserver_Landroid_database_DataSetObserver_Handler\n" +
			"n_getViewTypeCount:()I:GetGetViewTypeCountHandler\n" +
			"";
		mono.android.Runtime.register ("PullToRefresharp.SwipeMenuList.SwipeMenuAdapter, PullToRefresharp, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", SwipeMenuAdapter.class, __md_methods);
	}


	public SwipeMenuAdapter () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SwipeMenuAdapter.class)
			mono.android.TypeManager.Activate ("PullToRefresharp.SwipeMenuList.SwipeMenuAdapter, PullToRefresharp, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public SwipeMenuAdapter (android.content.Context p0, android.widget.ListAdapter p1) throws java.lang.Throwable
	{
		super ();
		if (getClass () == SwipeMenuAdapter.class)
			mono.android.TypeManager.Activate ("PullToRefresharp.SwipeMenuList.SwipeMenuAdapter, PullToRefresharp, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Widget.IListAdapter, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public boolean areAllItemsEnabled ()
	{
		return n_areAllItemsEnabled ();
	}

	private native boolean n_areAllItemsEnabled ();


	public boolean isEnabled (int p0)
	{
		return n_isEnabled (p0);
	}

	private native boolean n_isEnabled (int p0);


	public int getCount ()
	{
		return n_getCount ();
	}

	private native int n_getCount ();


	public java.lang.Object getItem (int p0)
	{
		return n_getItem (p0);
	}

	private native java.lang.Object n_getItem (int p0);


	public long getItemId (int p0)
	{
		return n_getItemId (p0);
	}

	private native long n_getItemId (int p0);


	public int getItemViewType (int p0)
	{
		return n_getItemViewType (p0);
	}

	private native int n_getItemViewType (int p0);


	public android.view.View getView (int p0, android.view.View p1, android.view.ViewGroup p2)
	{
		return n_getView (p0, p1, p2);
	}

	private native android.view.View n_getView (int p0, android.view.View p1, android.view.ViewGroup p2);


	public boolean hasStableIds ()
	{
		return n_hasStableIds ();
	}

	private native boolean n_hasStableIds ();


	public boolean isEmpty ()
	{
		return n_isEmpty ();
	}

	private native boolean n_isEmpty ();


	public void registerDataSetObserver (android.database.DataSetObserver p0)
	{
		n_registerDataSetObserver (p0);
	}

	private native void n_registerDataSetObserver (android.database.DataSetObserver p0);


	public void unregisterDataSetObserver (android.database.DataSetObserver p0)
	{
		n_unregisterDataSetObserver (p0);
	}

	private native void n_unregisterDataSetObserver (android.database.DataSetObserver p0);


	public int getViewTypeCount ()
	{
		return n_getViewTypeCount ();
	}

	private native int n_getViewTypeCount ();

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
