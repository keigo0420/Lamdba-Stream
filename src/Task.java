import java.time.LocalDate;

public class Task {
	// Comparableインタフェースを実装する
	private LocalDate date;
	private String task;
	boolean done;
	boolean incomplete = false;
	boolean completion = true;// 追加 完了はtrue, 未完了は false

	public Task(LocalDate date, String task, boolean done) {
		this.date = date;
		this.task = task;
		this.done = done;

	}

	public LocalDate getDate() {
		return date;
	}

	public String getTask() {
		return task;
	}

	// boolean型のgetterメソッドはis～とすることもあります
	public boolean isDone() {
		return done;
	}

	// compareToメソッドをオーバーライドする
	// 日付で並び替えるため、LocalDateのcompareToを使う

	public int compareTo(Task t) {
		return this.date.compareTo(t.date);
	}

	public String toString() {
		return this.date + " " + this.task;
	}
}
