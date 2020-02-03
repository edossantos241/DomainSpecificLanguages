package fsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fsm.FSM;
import fsm.FinalState;
import fsm.InitialState;
import fsm.State;
import fsm.Transition;
import fsm.aspects.FSMAspectFSMAspectProperties;
import java.util.function.Consumer;

@Aspect(className = FSM.class)
@SuppressWarnings("all")
public class FSMAspect {
  public static void execute(final FSM _self) {
    final fsm.aspects.FSMAspectFSMAspectProperties _self_ = fsm.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof fsm.FSM){
    	fsm.aspects.FSMAspect._privk3_execute(_self_, (fsm.FSM)_self);
    };
  }
  
  private static State current(final FSM _self) {
    final fsm.aspects.FSMAspectFSMAspectProperties _self_ = fsm.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# State current()
    if (_self instanceof fsm.FSM){
    	result = fsm.aspects.FSMAspect._privk3_current(_self_, (fsm.FSM)_self);
    };
    return (fsm.State)result;
  }
  
  private static void current(final FSM _self, final State current) {
    final fsm.aspects.FSMAspectFSMAspectProperties _self_ = fsm.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void current(State)
    if (_self instanceof fsm.FSM){
    	fsm.aspects.FSMAspect._privk3_current(_self_, (fsm.FSM)_self,current);
    };
  }
  
  private static State finalState(final FSM _self) {
    final fsm.aspects.FSMAspectFSMAspectProperties _self_ = fsm.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# State finalState()
    if (_self instanceof fsm.FSM){
    	result = fsm.aspects.FSMAspect._privk3_finalState(_self_, (fsm.FSM)_self);
    };
    return (fsm.State)result;
  }
  
  private static void finalState(final FSM _self, final State finalState) {
    final fsm.aspects.FSMAspectFSMAspectProperties _self_ = fsm.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void finalState(State)
    if (_self instanceof fsm.FSM){
    	fsm.aspects.FSMAspect._privk3_finalState(_self_, (fsm.FSM)_self,finalState);
    };
  }
  
  protected static void _privk3_execute(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    final Consumer<State> _function = (State s) -> {
      if ((s instanceof InitialState)) {
        FSMAspect.current(_self, s);
      } else {
        if ((s instanceof FinalState)) {
          FSMAspect.finalState(_self, s);
        }
      }
    };
    _self.getState().forEach(_function);
    final Consumer<Transition> _function_1 = (Transition t) -> {
      String _name = t.getSource().getName();
      String _plus = ("Transition de " + _name);
      String _plus_1 = (_plus + " à ");
      String _name_1 = t.getTarget().getName();
      String _plus_2 = (_plus_1 + _name_1);
      System.out.println(_plus_2);
    };
    _self.getTransition().forEach(_function_1);
  }
  
  protected static State _privk3_current(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrent") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (fsm.State) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.current;
  }
  
  protected static void _privk3_current(final FSMAspectFSMAspectProperties _self_, final FSM _self, final State current) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrent")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, current);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.current = current;
    }
  }
  
  protected static State _privk3_finalState(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getFinalState") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (fsm.State) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.finalState;
  }
  
  protected static void _privk3_finalState(final FSMAspectFSMAspectProperties _self_, final FSM _self, final State finalState) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setFinalState")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, finalState);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.finalState = finalState;
    }
  }
}
