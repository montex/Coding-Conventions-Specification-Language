/**
 */
package ccsl.elements.namedElements.provider;

import ccsl.elements.namedElements.NamedElementsPackage;

import ccsl.elements.namedElements.complexType.ComplexTypeFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ccsl.elements.namedElements.Package} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(NamedElementsPackage.Literals.PACKAGE__DECLARED_TYPES);
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
	 * This returns Package.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Package"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ccsl.elements.namedElements.Package) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Package_type")
				: getString("_UI_Package_type") + " " + label;
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

		switch (notification.getFeatureID(ccsl.elements.namedElements.Package.class)) {
		case NamedElementsPackage.PACKAGE__DECLARED_TYPES:
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

		newChildDescriptors.add(createChildParameter(NamedElementsPackage.Literals.PACKAGE__DECLARED_TYPES,
				ComplexTypeFactory.eINSTANCE.createTypeDeclaration()));

		newChildDescriptors.add(createChildParameter(NamedElementsPackage.Literals.PACKAGE__DECLARED_TYPES,
				ComplexTypeFactory.eINSTANCE.createComplexTypeDeclaration()));

		newChildDescriptors.add(createChildParameter(NamedElementsPackage.Literals.PACKAGE__DECLARED_TYPES,
				ComplexTypeFactory.eINSTANCE.createJInterface()));

		newChildDescriptors.add(createChildParameter(NamedElementsPackage.Literals.PACKAGE__DECLARED_TYPES,
				ComplexTypeFactory.eINSTANCE.createConstructComplexTypeDeclaration()));

		newChildDescriptors.add(createChildParameter(NamedElementsPackage.Literals.PACKAGE__DECLARED_TYPES,
				ComplexTypeFactory.eINSTANCE.createJClass()));

		newChildDescriptors.add(createChildParameter(NamedElementsPackage.Literals.PACKAGE__DECLARED_TYPES,
				ComplexTypeFactory.eINSTANCE.createAnnotationType()));

		newChildDescriptors.add(createChildParameter(NamedElementsPackage.Literals.PACKAGE__DECLARED_TYPES,
				ComplexTypeFactory.eINSTANCE.createJEnum()));
	}

}
