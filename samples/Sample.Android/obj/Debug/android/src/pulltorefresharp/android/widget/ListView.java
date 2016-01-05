package pulltorefresharp.android.widget;


public class ListView
	extends android.widget.ListView
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onInterceptTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnInterceptTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_getAdapter:()Landroid/widget/ListAdapter;:GetGetAdapterHandler\n" +
			"n_setAdapter:(Landroid/widget/ListAdapter;)V:GetSetAdapter_Landroid_widget_ListAdapter_Handler\n" +
			"";
		mono.android.Runtime.register ("PullToRefresharp.Android.Widget.ListView, PullToRefresharp, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", ListView.class, __md_methods);
	}


	public ListView (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == ListView.class)
			mono.android.TypeManager.Activate ("PullToRefresharp.Android.Widget.ListView, PullToRefresharp, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public ListView (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == ListView.class)
			mono.android.TypeManager.Activate ("PullToRefresharp.Android.Widget.ListView, PullToRefresharp, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public ListView (android.content.Context p0, android.util.AttributeSet p1, int p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == ListView.class)
			mono.android.TypeManager.Activate ("PullToRefresharp.Android.Widget.ListView, PullToRefresharp, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public boolean onInterceptTouchEvent (android.view.MotionEvent p0)
	{
		return n_onInterceptTouchEvent (p0);
	}

	private native boolean n_onInterceptTouchEvent (android.view.MotionEvent p0);


	public boolean onTouchEvent (android.view.MotionEvent p0)
	{
		return n_onTouchEvent (p0);
	}

	private native boolean n_onTouchEvent (android.view.MotionEvent p0);


	public android.widget.ListAdapter getAdapter ()
	{
		return n_getAdapter ();
	}

	private native android.widget.ListAdapter n_getAdapter ();


	public void setAdapter (android.widget.ListAdapter p0)
	{
		n_setAdapter (p0);
	}

	private native void n_setAdapter (android.widget.ListAdapter p0);

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
