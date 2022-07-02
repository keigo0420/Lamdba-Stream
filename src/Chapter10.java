import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.*;
import java.util.*;

public class Chapter10 {
	public static void main(String[] args) throws Exception {
		List<Task> list = new ArrayList<>();
		list.add(new Task(LocalDate.of(2021, 10, 21), "�����𔃂�", true));
		list.add(new Task(LocalDate.of(2021, 9, 15), "�����Жʐ�", false));
		list.add(new Task(LocalDate.of(2021, 12, 4), "�蒠�𔃂�", true));
		list.add(new Task(LocalDate.of(2021, 8, 10), "�U���ɍs��", false));
		list.add(new Task(LocalDate.of(2021, 11, 9), "�X�N�[���̉ۑ������", false));

		// �ȉ��L�q

		long count = list.stream()

				.filter(l -> !l.isDone())

				.count();
		System.out.println("�������̃^�X�N��" + count);
		System.out.println("�y�������̃^�X�N�������ɕ��ѕς��Ĉꗗ�\���z");

		list.stream()

				.filter(l -> !l.isDone()).sorted(Comparator.comparing(l1 -> l1.getDate()))

				.forEach(System.out::println);

	}
}
