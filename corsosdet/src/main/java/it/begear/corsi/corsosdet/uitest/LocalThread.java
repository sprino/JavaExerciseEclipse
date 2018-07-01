package it.begear.corsi.corsosdet.uitest;

public class LocalThread {
	public static final ThreadLocal<MarkContext> automationThreadLocal = new ThreadLocal<>();

	public static void set(MarkContext context) {
		automationThreadLocal.set(context);
	}

	public static void unset() {
		automationThreadLocal.remove();
	}

	public static MarkContext get() {
		return automationThreadLocal.get();
	}
}
