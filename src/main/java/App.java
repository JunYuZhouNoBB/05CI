import java.util.ArrayList;
import java.util.List;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }
	public boolean isPrime(long number){

		if (number < 1) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public List<Integer> first(int x) {
		int i;
		List<Integer> result = new ArrayList<>();
		for (i = 2; i <= x; i++) {
			while (x % i == 0) {
				result.add(i);
				x = x / i;
			}
		}
		return result;
	}

	public int two(int number,int number2){
		int min = number < number2 ? number : number2;
		int max = number > number2 ? number : number2;
		int count = 0;
		for (int i = min; i <= max; i++) {
			if (isPrime(i)) {

				count++;
			}
		}
		return count;
	}
	public int three(int number[]){
		int count = 0;
		for(int i=0;i<number.length;i++){
			if(isPrime(number[i])){
				count++;
			}
		}
		return count;
	}

    public static void main(String[] args) {
		App appObj = new App();
		if(args.length<1){
			System.out.println("Please input at least number as the program argument");
		}else if(args.length==1){
			System.out.println(appObj.isPrime(Integer.parseInt(args[0])));
			System.out.println(appObj.first(Integer.parseInt(args[0])));
		}
		else if(args.length==2){
			System.out.println(appObj.two(Integer.parseInt(args[0]),Integer.parseInt(args[0])));
		}else if(args.length>2){
			int arr[] = new int[args.length];
			for(int i=0;i<args.length;i++){
				arr[i] = Integer.parseInt(args[i]);
			}
			System.out.println(appObj.three(arr));
		}

        System.out.println(new App().getGreeting());

    }
}
