/**
 */
package ccsl.functions.booleanFunctions.filters.provider;

import ccsl.context.ContextFactory;

import ccsl.functions.booleanFunctions.filters.FiltersPackage;
import ccsl.functions.booleanFunctions.filters.HasSuperClassFilter;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.functions.booleanFunctions.filters.HasSuperClassFilter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HasSuperClassFilterItemProvider extends AtomicFilterItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasSuperClassFilterItemProvider(AdapterFactory adapterFactory) {
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

			addSuperClassPropertyDescriptor(object);
			addSubClassPropertyDescriptor(object);
			addIncludesTargetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Super Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_HasSuperClassFilter_superClass_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_HasSuperClassFilter_superClass_feature",
						"_UI_HasSuperClassFilter_type"),
				FiltersPackage.Literals.HAS_SUPER_CLASS_FILTER__SUPER_CLASS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Sub Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_HasSuperClassFilter_subClass_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_HasSuperClassFilter_subClass_feature",
						"_UI_HasSuperClassFilter_type"),
				FiltersPackage.Literals.HAS_SUPER_CLASS_FILTER__SUB_CLASS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Includes Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludesTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_HasSuperClassFilter_includesTarget_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_HasSuperClassFilter_includesTarget_feature", "_UI_HasSuperClassFilter_type"),
						FiltersPackage.Literals.HAS_SUPER_CLASS_FILTER__INCLUDES_TARGET, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(FiltersPackage.Literals.HAS_SUPER_CLASS_FILTER__CONTEXT);
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
	 * This returns HasSuperClassFilter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HasSuperClassFilter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		HasSuperClassFilter hasSuperClassFilter = (HasSuperClassFilter) object;
		return getString("_UI_HasSuperClassFilter_type") + " " + hasSuperClassFilter.isNegated();
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

		switch (notification.getFeatureID(HasSuperClassFilter.class)) {
		case FiltersPackage.HAS_SUPER_CLASS_FILTER__INCLUDES_TARGET:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case FiltersPackage.HAS_SUPER_CLASS_FILTER__CONTEXT:
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

		newChildDescriptors.add(createChildParameter(FiltersPackage.Literals.HAS_SUPER_CLASS_FILTER__CONTEXT,
				ContextFactory.eINSTANCE.createContext()));
	}

}
