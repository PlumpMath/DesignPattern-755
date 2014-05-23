package mediator;

/**
 * Demonstrates mediator pattern. Mediator pattern belongs to behavior pattern which means the underlying status of
 * application will be changed, while facade pattern belongs to structure pattern, which means it simply group several
 * operations together. Both patterns are used to provide a simple interface to clients so that they will be decouple
 * with the colleagues.
 *
 * GoF(Page 193). Mediator is similar to Facade in that it abstracts functionality of existing classes. However,
 * Mediator's purpose is to abstract arbitrary communication between colleague objects,
 * often centralizing functionality that doesn't belong in any one of them. A mediator's colleagues are aware of and
 * communicate with the mediator instead of communicating with each other directly. In contrast,
 * a facade merely abstracts the interface to subsystem objects to make them easier to use; it doesn't define new
 * functionality, and subsystem classes don't know about it.
 *
 * GoF(Page 282). Facade differs from Mediator in that it abstracts a subsystem of objects to provide a more
 * convenient interface. Its protocol is unidirectional; that is, Facade objects make requests of the subsystem
 * classes but not vice versa. In contrast, Mediator enables cooperative behavior that colleague objects don't or
 * can't provide, and the protocol is multi-directional.
 */
public class Demo {
    public static void main(String[] args) {
        new MediatorFrame();
    }
}
