/**
 */
package ccsl.functions.booleanFunctions.filters.provider;

import ccsl.functions.booleanFunctions.filters.CompositeFilter;
import ccsl.functions.booleanFunctions.filters.FiltersFactory;
import ccsl.functions.booleanFunctions.filters.FiltersPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.functions.booleanFunctions.filters.CompositeFilter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeFilterItemProvider extends FilterItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeFilterItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOperatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CompositeFilter_operator_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CompositeFilter_operator_feature",
								"_UI_CompositeFilter_type"),
						FiltersPackage.Literals.COMPOSITE_FILTER__OPERATOR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FiltersPackage.Literals.COMPOSITE_FILTER__FILTERS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CompositeFilter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompositeFilter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		CompositeFilter compositeFilter = (CompositeFilter) object;
		return getString("_UI_CompositeFilter_type") + " " + compositeFilter.isNegated();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CompositeFilter.class)) {
		case FiltersPackage.COMPOSITE_FILTER__OPERATOR:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case FiltersPackage.COMPOSITE_FILTER__FILTERS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.COMPOSITE_FILTER__FILTERS,
				FiltersFactory.eINSTANCE.createAtomicFilter()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.COMPOSITE_FILTER__FILTERS,
				FiltersFactory.eINSTANCE.createCompositeFilter()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.COMPOSITE_FILTER__FILTERS,
				FiltersFactory.eINSTANCE.createPropertyFilter()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.COMPOSITE_FILTER__FILTERS,
				FiltersFactory.eINSTANCE.createTemplateFilter()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.COMPOSITE_FILTER__FILTERS,
				FiltersFactory.eINSTANCE.createSameNameFilter()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.COMPOSITE_FILTER__FILTERS,
				FiltersFactory.eINSTANCE.createCountFilter()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.COMPOSITE_FILTER__FILTERS,
				FiltersFactory.eINSTANCE.createRegexMatch()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.COMPOSITE_FILTER__FILTERS,
				FiltersFactory.eINSTANCE.createImplicityOperandFilter()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.COMPOSITE_FILTER__FILTERS,
				FiltersFactory.eINSTANCE.createImplicityContainerFilter()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.COMPOSITE_FILTER__FILTERS,
				FiltersFactory.eINSTANCE.createIsKindOfFilter()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.COMPOSITE_FILTER__FILTERS,
				FiltersFactory.eINSTANCE.createSuperMethodClosureFilter()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.COMPOSITE_FILTER__FILTERS,
				FiltersFactory.eINSTANCE.createIsTypeOfFilter()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.COMPOSITE_FILTER__FILTERS,
				FiltersFactory.eINSTANCE.createChildClosureComplexTypeFilter()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.COMPOSITE_FILTER__FILTERS,
				FiltersFactory.eINSTANCE.createIsStringFilter()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.COMPOSITE_FILTER__FILTERS,
				FiltersFactory.eINSTANCE.createFromClosureFilter()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.COMPOSITE_FILTER__FILTERS,
				FiltersFactory.eINSTANCE.createHasSuperClassFilter()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.COMPOSITE_FILTER__FILTERS,
				FiltersFactory.eINSTANCE.createBlockLastStatementFilter()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.COMPOSITE_FILTER__FILTERS,
				FiltersFactory.eINSTANCE.createHasSameReferenceFilter()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.COMPOSITE_FILTER__FILTERS,
				FiltersFactory.eINSTANCE.createIsEmptyBlockFilter()));

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.COMPOSITE_FILTER__FILTERS,
				FiltersFactory.eINSTANCE.createImplicitContentsFilter()));
	}

}
