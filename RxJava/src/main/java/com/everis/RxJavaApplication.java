package com.everis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.reactivex.Observable;
import io.reactivex.Observer;

@SpringBootApplication
public class RxJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RxJavaApplication.class, args);
	
	Observable <String> mensaje = Observable.just("mensaje1", "mensaje2", "mensaje3");	
	
	
	Observer<String> observer1 = new Observer<String>() {
		@Override
		public void onSubscribe(Disposable d) {
			System.out.println("observer 1 . suscriptor");
		}
		
		@Override
		public void onNext(String s) {
			System.out.println("observer 1 . recibe"+ s);
		}
		@Override
		public void onError(Throwable e) {
			System.out.println("observer 1 . error" + e.getMessege());
		}
		@Override
		public void onComplete() {
			System.out.println("observer 1 . completado");
		}
	}
	mensaje.subscribe(observer1);

}
	
	
	Flux <String> mensaje2 = Flux.just("mensaje1", "mensaje2", "mensaje3");	


     mensaje2.subscribe(message -> System.out.println("Observer 1 - recibido" + mensaje2));

}
}
