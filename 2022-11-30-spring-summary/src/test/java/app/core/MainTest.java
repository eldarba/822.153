package app.core;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import app.core.entities.Address;
import app.core.entities.Library;
import app.core.services.LibraryApplicationAdminService;

@SpringBootTest
class MainTest {

	@Autowired
	private LibraryApplicationAdminService service;

	@BeforeAll
	public static void x() {
		System.out.println("Before all");
	}

	@Test
	void test1() {

		System.out.println("Test 1");

		assertThat(service).isNotNull();
		Library lib1 = service
				.addLibrary(new Library(0, "LibraryA", new Address(0, "Beer Sheva", "Herzel", null), null));
		Library lib2 = service.addLibrary(new Library(0, "LibraryB", new Address(0, "Tel Aviv", "Begin", null), null));

		assertThat(lib1).isNull();
		assertThat(lib2).isNull();

//		assertSoftly(softly -> {
//			System.out.println(111111111);
//			softly.assertThat(lib1).isNull();
//			System.out.println(222222222);
//			softly.assertThat(lib2).isNull();
//			System.out.println(333333333);
//		});

	}

	@Test
	void test2() {

		System.out.println("Test 2");

		assertThat(service).isNotNull();
		Library lib1 = service
				.addLibrary(new Library(0, "LibraryA", new Address(0, "Beer Sheva", "Herzel", null), null));
		Library lib2 = service.addLibrary(new Library(0, "LibraryB", new Address(0, "Tel Aviv", "Begin", null), null));

//		assertThat(lib1).isNull();
//		assertThat(lib2).isNull();

		assertSoftly(softly -> {
			System.out.println(-111111111);
			softly.assertThat(lib1).isNull();
			System.out.println(-222222222);
			softly.assertThat(lib2).isNull();
			System.out.println(-333333333);
		});

	}

}
