/**
 */
package org.scaledl.usageevolution.impl;

import de.uka.ipd.sdq.pcm.PcmPackage;

import de.uka.ipd.sdq.pcm.core.entity.EntityPackage;

import de.uka.ipd.sdq.pcm.usagemodel.UsagemodelPackage;

import dlim.DlimPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.scaledl.usageevolution.Usage;
import org.scaledl.usageevolution.UsageEvolution;
import org.scaledl.usageevolution.UsageevolutionFactory;
import org.scaledl.usageevolution.UsageevolutionPackage;
import org.scaledl.usageevolution.WorkParameterEvolution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsageevolutionPackageImpl extends EPackageImpl implements UsageevolutionPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass usageEvolutionEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass usageEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass workParameterEvolutionEClass = null;

	/**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.scaledl.usageevolution.UsageevolutionPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private UsageevolutionPackageImpl() {
        super(eNS_URI, UsageevolutionFactory.eINSTANCE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static boolean isInited = false;

	/**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link UsageevolutionPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static UsageevolutionPackage init() {
        if (isInited) return (UsageevolutionPackage)EPackage.Registry.INSTANCE.getEPackage(UsageevolutionPackage.eNS_URI);

        // Obtain or create and register package
        UsageevolutionPackageImpl theUsageevolutionPackage = (UsageevolutionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UsageevolutionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UsageevolutionPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        DlimPackage.eINSTANCE.eClass();
        PcmPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theUsageevolutionPackage.createPackageContents();

        // Initialize created meta-data
        theUsageevolutionPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theUsageevolutionPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(UsageevolutionPackage.eNS_URI, theUsageevolutionPackage);
        return theUsageevolutionPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getUsageEvolution() {
        return usageEvolutionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUsageEvolution_Usages() {
        return (EReference)usageEvolutionEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getUsage() {
        return usageEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUsage_LoadEvolution() {
        return (EReference)usageEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUsage_WorkEvolutions() {
        return (EReference)usageEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getUsage_Scenario() {
        return (EReference)usageEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getWorkParameterEvolution() {
        return workParameterEvolutionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getWorkParameterEvolution_Evolution() {
        return (EReference)workParameterEvolutionEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getWorkParameterEvolution_ParameterName() {
        return (EAttribute)workParameterEvolutionEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public UsageevolutionFactory getUsageevolutionFactory() {
        return (UsageevolutionFactory)getEFactoryInstance();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isCreated = false;

	/**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        usageEvolutionEClass = createEClass(USAGE_EVOLUTION);
        createEReference(usageEvolutionEClass, USAGE_EVOLUTION__USAGES);

        usageEClass = createEClass(USAGE);
        createEReference(usageEClass, USAGE__LOAD_EVOLUTION);
        createEReference(usageEClass, USAGE__WORK_EVOLUTIONS);
        createEReference(usageEClass, USAGE__SCENARIO);

        workParameterEvolutionEClass = createEClass(WORK_PARAMETER_EVOLUTION);
        createEReference(workParameterEvolutionEClass, WORK_PARAMETER_EVOLUTION__EVOLUTION);
        createEAttribute(workParameterEvolutionEClass, WORK_PARAMETER_EVOLUTION__PARAMETER_NAME);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isInitialized = false;

	/**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
        DlimPackage theDlimPackage = (DlimPackage)EPackage.Registry.INSTANCE.getEPackage(DlimPackage.eNS_URI);
        UsagemodelPackage theUsagemodelPackage = (UsagemodelPackage)EPackage.Registry.INSTANCE.getEPackage(UsagemodelPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        usageEvolutionEClass.getESuperTypes().add(theEntityPackage.getEntity());
        usageEClass.getESuperTypes().add(theEntityPackage.getEntity());

        // Initialize classes and features; add operations and parameters
        initEClass(usageEvolutionEClass, UsageEvolution.class, "UsageEvolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUsageEvolution_Usages(), this.getUsage(), null, "usages", null, 1, -1, UsageEvolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(usageEClass, Usage.class, "Usage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUsage_LoadEvolution(), theDlimPackage.getSequence(), null, "loadEvolution", null, 0, 1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getUsage_WorkEvolutions(), this.getWorkParameterEvolution(), null, "workEvolutions", null, 0, -1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getUsage_Scenario(), theUsagemodelPackage.getUsageScenario(), null, "scenario", null, 1, 1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(workParameterEvolutionEClass, WorkParameterEvolution.class, "WorkParameterEvolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getWorkParameterEvolution_Evolution(), theDlimPackage.getSequence(), null, "evolution", null, 1, 1, WorkParameterEvolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getWorkParameterEvolution_ParameterName(), ecorePackage.getEString(), "parameterName", null, 0, 1, WorkParameterEvolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //UsageevolutionPackageImpl
