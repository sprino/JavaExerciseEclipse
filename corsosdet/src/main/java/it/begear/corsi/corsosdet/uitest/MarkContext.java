package it.begear.corsi.corsosdet.uitest;

import java.util.Collections;
import java.util.List;

public abstract class MarkContext {
	private final String testRunId;
	private final List<MarkContext> benchmarkableObjectList;

	public MarkContext(List<String> annotations, String testRunId){

		this.benchmarkableObjectList=convertAnnotation(annotations);
		this.testRunId=testRunId;
	}

	protected abstract List<MarkContext> convertAnnotation(List<String> annotation);

	public List<MarkContext> getBenchmarkableObjectList() {
		return Collections.unmodifiableList(benchmarkableObjectList);
	}

	public String getTestRunId() {
		return testRunId;
	}
}
