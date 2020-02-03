package fsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fsm.FinalState;
import fsm.aspects.StateAspect;

@Aspect(className = FinalState.class)
@SuppressWarnings("all")
public class FinalStateAspect extends StateAspect {
}
