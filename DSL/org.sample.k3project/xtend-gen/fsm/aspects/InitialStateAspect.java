package fsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fsm.InitialState;
import fsm.aspects.StateAspect;

@Aspect(className = InitialState.class)
@SuppressWarnings("all")
public class InitialStateAspect extends StateAspect {
}
